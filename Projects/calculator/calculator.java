class Calculator {
    public Calculator {
      
    }
    public int add(int a, int b) {
      int sum = a + b;
      return sum;
      }
    public int substract(int a, int b) {
     int substract = a - b;
     return substract;
    }
    public int multiply(int a, int b) {
     int multiplication = a * b;
     return multiplication;
    }
    public int divide(int a, int b) {
      if (b == 0){
        System.out.println("Error! Division by zero is not allowed.");
        return 0;
      }
      else{
        int division = a / b;
        return division;
      }
      
      }
  }