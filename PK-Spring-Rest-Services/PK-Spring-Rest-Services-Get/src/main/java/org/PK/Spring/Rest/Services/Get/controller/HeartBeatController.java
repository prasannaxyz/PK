
package org.PK.Spring.Rest.Services.Get.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 
 *
 */
@RestController
@RequestMapping("/heartbeat")
public class HeartBeatController {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("I am alive");
    }
}
