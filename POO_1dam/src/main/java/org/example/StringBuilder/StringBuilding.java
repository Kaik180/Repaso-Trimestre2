package org.example.StringBuilder;

public class StringBuilding {
    static void main() {
        StringBuilder sb = new StringBuilder();

        sb.append("calleu ");
        sb.append("mantecao ").append("joaquin!!").append(" adios");

        System.out.println(sb);

        sb.insert(16, "de limon ");

        System.out.println(sb);

        sb.replace(25,35, "jacobo ");

        System.out.println(sb);

        sb.delete(25,32);

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);
    }
}
