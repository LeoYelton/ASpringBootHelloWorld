<Fibonacci.java>
<![CDATA[
package org.example;

public class Fibonacci {
  public static long[] getFibonacciSequence(int n) {
      if (n <= 0) {
          throw new IllegalArgumentException("The length of the sequence must be greater than zero.");
      }

      long[] sequence = new long[n];
      sequence[0] = 0;
      sequence[1] = 1;

      for (int i = 2; i < n; i++) {
          sequence[i] = sequence[i - 1] + sequence[i - 2];
      }

      return sequence;
  }
}
]]>
</Fibonacci.java>
