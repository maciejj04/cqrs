package com.maciejj.cqrssample.cqrs.utils;

import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplateModel;
import net.bytebuddy.utility.RandomString;

public class TestUtils {

    public static ApplicationTemplateModel randomApplicationTemplate(){
        return new ApplicationTemplateModel(RandomString.make(10));
    }
}
