package com.sachin.pattern;

public class StarWhileLoop {

        public static void main(String[] args) {
            // Using POJO to configure the pattern
            PyramidSettings settings = new PyramidSettings(5); // Set rows to 5
            printReversePyramid(settings.getRows());
        }

        public static void printReversePyramid(int rows) {
            int i = rows;
            while (i >= 1) { // Outer loop for rows
                int j = 1;
                while (j <= i) { // Inner loop for stars in each row
                    System.out.print("* ");
                    j++;
                }
                System.out.println(); // Move to the next line
                i--;
            }
        }

        static class PyramidSettings {
            private int rows;

            public PyramidSettings(int rows) {
                this.rows = rows;
            }

            public int getRows() {
                return rows;
            }

            public void setRows(int rows) {
                this.rows = rows;
            }
        }
    }


