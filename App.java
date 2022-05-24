import java.util.Arrays;

class App {
  public static void main(String args[]) {
    mean(scores);
    median(scores);
  }

  static double[] scores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };

  private static void mean(double[] numericArray) {
    double total = 0;
    for (int i = 0; i < numericArray.length; i++) {
      total = total + numericArray[i];
    }
    double mean = total / numericArray.length;
    System.out.println("The mean is " + mean);
  }

  private static void median(double[] numericArray) {
    Arrays.sort(numericArray);
    double median;
    if (numericArray.length % 2 == 0)
      median = ((double) numericArray[numericArray.length / 2] + (double) numericArray[numericArray.length / 2 - 1]) / 2;
    else
      median = (double) numericArray[numericArray.length / 2];
    System.out.println("The mean is " + median);
  }
}
