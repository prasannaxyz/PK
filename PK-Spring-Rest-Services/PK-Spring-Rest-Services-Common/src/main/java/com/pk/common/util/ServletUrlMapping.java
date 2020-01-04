package com.pk.common.util;

import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class ServletUrlMapping {
  private static final String ENABLE_URL_RECREATION_SYS_PROP = "enable.url.recreation";
  private static final String DEFAULT_RECREATE_URL = "false";

  private final String mappingUrl;

  private ServletUrlMapping(final String mappingUrl) {
    this.mappingUrl = mappingUrl;
  }

  public String getMappingUrl() {
    return mappingUrl;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String subFunctionGroup = StringUtils.EMPTY;
    private String dispatcherMappingUrl = StringUtils.EMPTY;
    private String contextPath = StringUtils.EMPTY;

    public Builder withContextPathAs(final String contextPath) {
      this.contextPath = contextPath;
      return this;
    }

    public Builder withServletContextAs(final ServletContext servletContext) {
      this.contextPath = servletContext.getContextPath();
      return this;
    }

    public Builder withDispatcherMappingUrlAs(final String dispatcherMappingUrl) {
      this.dispatcherMappingUrl = dispatcherMappingUrl;
      return this;
    }

    public Builder withSubFunctionGroupAs(final String subFunctionGroup) {
      this.subFunctionGroup = subFunctionGroup;
      return this;
    }

    public ServletUrlMapping build() {
      boolean urlShouldRecreated = checkIfUrlShouldRecreated();
      if (urlShouldRecreated && StringUtils.isNotBlank(subFunctionGroup)) {
        final List<String> contextPathParts = Splitter.on("/").omitEmptyStrings().splitToList(contextPath);
        final List<String> dispatcherMappingUrlParts = Splitter.on("/").omitEmptyStrings().splitToList(dispatcherMappingUrl);
        final List<String> subFunctionGroupParts = Splitter.on("/").omitEmptyStrings().splitToList(subFunctionGroup);
        final List<String> urlParts = Lists.newArrayList();
        final boolean contextPathEndsWithSubFunctionGroup = contextPathEndsWithSubFunctionGroup(contextPathParts, subFunctionGroupParts);
        final boolean dispatcherUrlStartsWithSubFunctionGroup = dispatcherUrlStartsWithSubFunctionGroup(dispatcherMappingUrlParts, subFunctionGroupParts);
        if (!contextPathEndsWithSubFunctionGroup && !dispatcherUrlStartsWithSubFunctionGroup) {
          urlParts.addAll(subFunctionGroupParts);
          urlParts.addAll(dispatcherMappingUrlParts);
        } else {
          urlParts.addAll(dispatcherMappingUrlParts);
        }
        final String finalUrl = Joiner.on("/").join(urlParts);
        return new ServletUrlMapping(finalUrl);
      } else {
        return new ServletUrlMapping(dispatcherMappingUrl);
      }
    }

    private boolean checkIfUrlShouldRecreated() {
      String enableUrlRecreation = System.getProperty(ENABLE_URL_RECREATION_SYS_PROP, DEFAULT_RECREATE_URL);
      if (StringUtils.isNotBlank(enableUrlRecreation) && BooleanUtils.toBoolean(enableUrlRecreation)) {
        return true;
      }
      return false;
    }

    private boolean contextPathEndsWithSubFunctionGroup(final List<String> contextPathParts, final List<String> subFunctionGroupParts) {
      if (CollectionUtils.isNotEmpty(subFunctionGroupParts) && CollectionUtils.isNotEmpty(contextPathParts)) {
        final List<String> lastPartsOfContextPathForMatch = collectLastPartsOfContextPathToMatchSubFunctionGroup(contextPathParts, subFunctionGroupParts);
        if (lastPartsOfContextPathForMatch.equals(subFunctionGroupParts)) {
          return true; 
        }
      }
      return false;
    }




    private List<String> collectLastPartsOfContextPathToMatchSubFunctionGroup(final List<String> contextPathParts, final List<String> subFunctionGroupParts) {
      final List<String> lastPartsOfContextPathForMath = Lists.newArrayList();
      if (contextPathParts.size() >= subFunctionGroupParts.size()) {
        for (int index = subFunctionGroupParts.size() - 1; index >= 0; index-- ) {
          lastPartsOfContextPathForMath.add(contextPathParts.get(contextPathParts.size() - 1 - index));
        }
      }
      return lastPartsOfContextPathForMath;
    }

    private boolean dispatcherUrlStartsWithSubFunctionGroup(final List<String> contextPathParts, final List<String> subFunctionGroupParts) {
      if (CollectionUtils.isNotEmpty(subFunctionGroupParts) && CollectionUtils.isNotEmpty(contextPathParts)) {
        final List<String> firstPartsOfDispathcherUrlForExactMatch = collectFirstPartsOfDispatcherUrlToMatchSubFunctionGroup(contextPathParts, subFunctionGroupParts);
        if (firstPartsOfDispathcherUrlForExactMatch.equals(subFunctionGroupParts)) {
          return true; 
        }
      }
      return false;
    }

    private List<String> collectFirstPartsOfDispatcherUrlToMatchSubFunctionGroup(final List<String> dispatcherMappingUrlParts, final List<String> subFunctionGroupParts) {
      final List<String> firstPartsOfDispathcherUrlForExactMatch = Lists.newArrayList();
      if (dispatcherMappingUrlParts.size() >= subFunctionGroupParts.size()) {
        for (int index = 0; index < subFunctionGroupParts.size(); index++ ) {
          firstPartsOfDispathcherUrlForExactMatch.add(dispatcherMappingUrlParts.get(index));
        }
      }
      return firstPartsOfDispathcherUrlForExactMatch;
    }
  }

}
