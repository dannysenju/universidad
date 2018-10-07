package com.seratic.universidad.web.controller;

import com.seratic.universidad.persist.entity.AspiringTest;
import com.seratic.universidad.persist.repo.TestRepo;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(description = "Users management API")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestRepo testRepo;

    @RequestMapping(value = "/tests", method = RequestMethod.GET)
    public @ResponseBody
    List<AspiringTest> testsList() {
        logger.debug("get test list");
        return testRepo.findAll();
    }

    @RequestMapping(value = "/tests/{testId}", method = RequestMethod.GET)
    public @ResponseBody
    AspiringTest getTest(@PathVariable Long testId) {
        logger.debug("get test");
        return testRepo.findOne(testId);
    }

    @RequestMapping(value = "/tests", method = RequestMethod.POST)
    public @ResponseBody
    AspiringTest saveTest(@RequestBody AspiringTest test) {
        logger.debug("save test");
        testRepo.save(test);
        return test;
    }

}
