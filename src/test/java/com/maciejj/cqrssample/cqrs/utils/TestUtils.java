package com.maciejj.cqrssample.cqrs.utils;

import com.maciejj.cqrssample.cqrs.domain.readModels.ApplicationTemplate;
import net.bytebuddy.utility.RandomString;

public class TestUtils {

    public static ApplicationTemplate randomApplicationTemplate(){
        return new ApplicationTemplate(RandomString.make(10));
    }
}
