package com.barzykin.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class InputUtils {

    private InputUtils() {
        // prevents object creation
    }

    public static String readStr() {
        try  {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String result = reader.readLine();
            if (StringUtils.isEmpty(result)) {
                result = reader.readLine();
            }
            return result;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new IllegalArgumentException(e);
        }
    }

    public static int readInt() {
        String str = readStr();
        return Integer.parseInt(str);
    }


}
