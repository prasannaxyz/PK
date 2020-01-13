package org.PK.Spring.Rest.Services.Update;

import org.springframework.stereotype.Component;

@Component("com.pst.app.crewpro.role.update.v2_0.helpers.DataAccessHelperImpl")
public class DataAccessHelperImpl {/*

    @Autowired
    @Qualifier(value = "com.pst.app.crewpro.role.update.v2_0.dao.DeleteRoleDataAccessDAOImpl")
    private DeleteRoleDataAccessDAO deleteRoleDataAccessDAO;

    @Autowired
    @Qualifier(value = "com.pst.app.crewpro.role.update.v2_0.dao.DeleteRoleDataAccessValueDAOImpl")
    private DeleteRoleDataAccessValueDAO deleteRoleDataAccessValueDAO;

    @Autowired
    @Qualifier(value = "com.pst.app.crewpro.role.update.v2_0.dao.CreateRoleDataAccessDAOImpl")
    private CreateRoleDataAccessDAO createRoleDataAccessDAO;

    @Autowired
    @Qualifier(value = "com.pst.app.crewpro.role.update.v2_0.dao.CreateDataAccessValueDAOImpl")
    private CreateRoleDataAccessValueDAO createRoleDataAccessValueDAO;

    @Autowired
    @Qualifier(value = "com.pst.app.crewpro.role.update.v2_0.dao.dataaccess.UpdateRoleDataAccessDAOImpl")
    private UpdateRoleDataAccessDAO updateRoleDataAccessDAO;

    @Autowired
    @Qualifier(value = "com.pst.app.crewpro.role.update.v2_0.dao.dataaccess.UpdateRoleDataAccessValueDAOImpl")
    private UpdateRoleDataAccessValueDAO updateRoleDataAccessValueDAO;

    @Override
    public void operations(String roleName,
            List<RoleDataAccess> roleDataAccessListRequest,
            List<RoleDataAccess> existingroleDataAccessList,
            String userId) {
        delete(roleDataAccessListRequest, existingroleDataAccessList);
        create(roleName, roleDataAccessListRequest, userId);
        update(CollectionUtils.isEmpty(roleDataAccessListRequest) ? Lists.newArrayList() : roleDataAccessListRequest,
                CollectionUtils.isEmpty(existingroleDataAccessList) ? Lists.newArrayList() : existingroleDataAccessList, userId);
    }

    private void update(List<RoleDataAccess> roleDataAccessListRequest, List<RoleDataAccess> existingroleDataAccessList, String userId) {
        List<RoleDataAccess> toBeUpdatedDataAccessList = Lists.newArrayList(
                CollectionUtils.intersection(roleDataAccessListRequest, existingroleDataAccessList));
        if (CollectionUtils.isNotEmpty(toBeUpdatedDataAccessList)) {
            updateRoleDataAccessDAO.update(toBeUpdatedDataAccessList, userId);
        }
        List<DataAccessValue> roleDataAccessValuesRequest = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(roleDataAccessListRequest)) {
            roleDataAccessValuesRequest = roleDataAccessListRequest.stream().filter(
                    roleDataAccess -> CollectionUtils.isNotEmpty(roleDataAccess.getDataAccessValues())).map(
                            RoleDataAccess::getDataAccessValues).collect(Collectors.toList()).stream().flatMap(List::stream).collect(
                                    Collectors.toList());
        }
        List<DataAccessValue> existingRoleDataAccessValues = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(roleDataAccessListRequest)) {
            existingRoleDataAccessValues = existingroleDataAccessList.stream().filter(
                    roleDataAccess -> CollectionUtils.isNotEmpty(roleDataAccess.getDataAccessValues())).map(
                            RoleDataAccess::getDataAccessValues).collect(Collectors.toList()).stream().flatMap(List::stream).collect(
                                    Collectors.toList());

        }

        List<DataAccessValue> toBeUpdatedDataAccessValueList = Lists.newArrayList(
                CollectionUtils.intersection(roleDataAccessValuesRequest, existingRoleDataAccessValues));
        if (CollectionUtils.isNotEmpty(toBeUpdatedDataAccessValueList)) {
            updateRoleDataAccessValueDAO.update(toBeUpdatedDataAccessValueList, userId);
        }

    }

    private void create(String roleName, List<RoleDataAccess> roleDataAccessListRequest, String userId) {
        if (CollectionUtils.isNotEmpty(roleDataAccessListRequest)) {
            roleDataAccessListRequest.stream().forEach(roleDataAccess -> roleDataAccess.setRoleName(roleName));
            List<RoleDataAccess> toBeCreatedAccessList = roleDataAccessListRequest.stream().filter(
                    access -> Objects.isNull(access.getRoleDataAccessOId())).collect(Collectors.toList());
            createRoleDataAccessDAO.create(toBeCreatedAccessList, userId);
            List<DataAccessValue> dataAccessValueList = Lists.newArrayList();
            roleDataAccessListRequest.stream().forEach(roleDataAccess -> {
                if (CollectionUtils.isNotEmpty(roleDataAccess.getDataAccessValues())) {
                    roleDataAccess.getDataAccessValues().stream().filter(
                            accessValue -> Objects.isNull(accessValue.getRoleDataAccessValueOId())).forEach(dataAccessValue -> {
                                dataAccessValue.setRoleDataAccessOId(roleDataAccess.getRoleDataAccessOId());
                                dataAccessValueList.add(dataAccessValue);
                            });
                }
            });
            createRoleDataAccessValueDAO.create(dataAccessValueList, userId);
        }
    }

    private void delete(List<RoleDataAccess> roleDataAccessListRequest, List<RoleDataAccess> existingroleDataAccessList) {
        List<DataAccessValue> dataAccessValuesRequest = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(roleDataAccessListRequest)) {
            dataAccessValuesRequest = roleDataAccessListRequest.stream().filter(
                    dataAccess -> CollectionUtils.isNotEmpty(dataAccess.getDataAccessValues())).map(RoleDataAccess::getDataAccessValues).collect(
                            Collectors.toList()).stream().flatMap(List::stream).collect(Collectors.toList());

        }
        List<DataAccessValue> existingDataAccessValues = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(existingroleDataAccessList)) {
            existingDataAccessValues = existingroleDataAccessList.stream().filter(
                    dataAccess -> CollectionUtils.isNotEmpty(dataAccess.getDataAccessValues())).map(RoleDataAccess::getDataAccessValues).collect(
                            Collectors.toList()).stream().flatMap(List::stream).collect(Collectors.toList());

        }

        List<DataAccessValue> toBeDeletedDataAccessValuesList = Lists.newArrayList(
                CollectionUtils.subtract(existingDataAccessValues, dataAccessValuesRequest));
        if (CollectionUtils.isNotEmpty(toBeDeletedDataAccessValuesList)) {
            deleteRoleDataAccessValueDAO.delete(toBeDeletedDataAccessValuesList);
        }
        List<RoleDataAccess> toBeDeletedDataAccessList = Lists.newArrayList(
                CollectionUtils.subtract(existingroleDataAccessList, roleDataAccessListRequest));
        if (CollectionUtils.isNotEmpty(toBeDeletedDataAccessList)) {
            deleteRoleDataAccessDAO.delete(toBeDeletedDataAccessList);
        }

    }

*/}
