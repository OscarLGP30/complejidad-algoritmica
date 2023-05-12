package org.example.ComplejidadAlgoritmica.src.javaapplication1;

import java.util.List;

public class MetodosPrueba {
    public void m1(int n) {
    for (int i = 0; i < n; ++i)
        try {
            Thread.sleep(50L);
        } catch (InterruptedException var5) {
        }
}
    public void m2(int n) {
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException var4) {
            }
        }
    }

    public void m3(int n) {
        for (int i = 0; i < n; ++i) {
            try {
                Thread.sleep(60L);
            } catch (InterruptedException var4) {
            }
        }
    }

    public void m4(int n) {
        for (int k = 0; k < n; ++k) {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException var6) {
                    }
                }
            }
        }

    }

    public void m5(int n) {
        for (int i = 1; i < n; i *= 2) {
            try {
                Thread.sleep(300L);
            } catch (InterruptedException var4) {

            }
        }
    }

    public void m6(int n) {
        for (int i = 0; i < n; ++i) {
            try {
                Thread.sleep(60L);
            } catch (InterruptedException var4) {
            }
        }
    }


    public void m7(int n) {
        for (int i = 0; i < n; i *= 2) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException var4) {
            }
        }
    }

}




