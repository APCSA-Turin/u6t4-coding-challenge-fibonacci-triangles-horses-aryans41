package com.example.project;

public class Fibonacci {
  private int[] sequence;

  public Fibonacci(int seqLen) {
    sequence = new int[seqLen]; 
    sequence[0] = 0; 
    sequence[1] = 1; 
    for (int i = 2; i < seqLen; i++) {
      sequence[i] = sequence[i - 1] + sequence[i - 2]; 
    }
  }

  public int[] getSequence() {
    return sequence;
  }

  public int getIndexOf(int searchVal) {
    for (int i = 0; i < sequence.length; i++) {
      if (searchVal == sequence[i]) {
        return i;
      }
    }
    return -1;
  }

  public void extendBy(int howManyMore) {
    int[] extendedSeq = new int [sequence.length + howManyMore];
    for (int i = 0; i < extendedSeq.length; i++) {
      if (i < sequence.length) {
        extendedSeq[i] = sequence[i];
      } else {
        extendedSeq[i] = extendedSeq[i - 1] + extendedSeq[i - 2];
      }
    }
    sequence = extendedSeq;
  }

  public String fibonacciString() {
    return ArrayPrinter.printableString(sequence); 
  }
}
