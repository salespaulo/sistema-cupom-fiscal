package br.com.sweda.sistema.cupom.fiscal.util;

import java.io.InputStream;

public final class Utils {

    public static InputStream getInputStream(String path) {
        return ClassLoader.getSystemResourceAsStream(path);
    }

    private Utils() {
        new AssertionError();
    }
}
