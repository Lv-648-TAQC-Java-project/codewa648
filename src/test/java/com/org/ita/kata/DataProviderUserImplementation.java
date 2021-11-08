package com.org.ita.kata;

import org.apache.commons.lang3.SerializationUtils;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataProviderUserImplementation {

    public static Object[][] combine(Object[][] impl, Object[][] data2) {
//        Object[][] impl = SerializationUtils.clone(impl2
        Object[][] data = SerializationUtils.clone(data2);
        List<Object[]> listObjects = new ArrayList<>();
        for (Object[] obj_impl : impl) {

            for (Object[] obj_data : data) {
                int totalLength = obj_data.length + obj_impl.length;
                Object[] objArr = new Object[totalLength];

                Object[] objDataClone = Arrays.stream(obj_data).toArray();
                System.arraycopy(obj_impl, 0, objArr, 0, obj_impl.length);
                System.arraycopy(objDataClone, 0, objArr, obj_impl.length, totalLength - 1);

                listObjects.add(objArr);
            }
        }

        return listObjects.toArray(new Object[0][0]);

    }

    @DataProvider
    public Object[][] implementationsEightKataDataProvider() {

        return new Object[][]{{new com.org.ita.kata.implementation.andriy66.Eigth()},
                {new com.org.ita.kata.implementation.AndriyBarskyi.Eigth()},
                {new com.org.ita.kata.implementation.MakKeywa.Eigth()},
                {new com.org.ita.kata.implementation.Nadya101.Eigth()},
                {new com.org.ita.kata.implementation.Mykhailo5.Eigth()},
                {new com.org.ita.kata.implementation.nataskrypak.Eigth()},
                {new com.org.ita.kata.implementation.Pidstavskiy.Eigth()},
                {new com.org.ita.kata.implementation.vy1989.Eigth()},};
    }

    @DataProvider
    public Object[][] implementationsFiveKataDataProvider() {

        return new Object[][]{{new com.org.ita.kata.implementation.andriy66.Five()},
                {new com.org.ita.kata.implementation.AndriyBarskyi.Five()},
                {new com.org.ita.kata.implementation.MakKeywa.Five()},
                {new com.org.ita.kata.implementation.Nadya101.Five()},
                {new com.org.ita.kata.implementation.Mykhailo5.Five()},
                {new com.org.ita.kata.implementation.nataskrypak.Five()},
                {new com.org.ita.kata.implementation.Pidstavskiy.Five()},
                {new com.org.ita.kata.implementation.vy1989.Five()},};
    }

    @DataProvider
    public Object[][] implementationsSixKataDataProvider() {

        return new Object[][]{{new com.org.ita.kata.implementation.andriy66.Six()},
                {new com.org.ita.kata.implementation.AndriyBarskyi.Six()},
                {new com.org.ita.kata.implementation.MakKeywa.Six()},
                {new com.org.ita.kata.implementation.Nadya101.Six()},
                {new com.org.ita.kata.implementation.Mykhailo5.Six()},
                {new com.org.ita.kata.implementation.nataskrypak.Six()},
                {new com.org.ita.kata.implementation.Pidstavskiy.Six()},
                {new com.org.ita.kata.implementation.vy1989.Six()},};
    }

    @DataProvider
    public Object[][] implementationsSevenKataDataProvider() {

        return new Object[][]{{new com.org.ita.kata.implementation.andriy66.Seven()},
                {new com.org.ita.kata.implementation.AndriyBarskyi.Seven()},
                {new com.org.ita.kata.implementation.MakKeywa.Seven()},
                {new com.org.ita.kata.implementation.Nadya101.Seven()},
                {new com.org.ita.kata.implementation.Mykhailo5.Seven()},
                {new com.org.ita.kata.implementation.nataskrypak.Seven()},
                {new com.org.ita.kata.implementation.Pidstavskiy.Seven()},
                {new com.org.ita.kata.implementation.vy1989.Seven()},};
    }

}