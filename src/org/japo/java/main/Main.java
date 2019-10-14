/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes
        final int AFORO_MIN = 1;
        final int AFORO_MAX = 100;

        // Generar dato aforo = a numero aleatorio
        int aforo = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;

        System.out.printf("Aforo actual del local ....: %d.%n", aforo);
    }
}
