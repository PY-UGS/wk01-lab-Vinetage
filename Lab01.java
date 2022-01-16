class Main
{
  public static void main(String[] args)
  {
    System.out.println("Hello, I am Calvert");


    String courseCode = "CSC1009";
    switch(courseCode)
    {
      case "CSC1009":
        System.out.println("Object-Oriented Programming");
      break;
      default:
        System.out.println("Class does not exist");
      break;
    }

    for(int i = 102; i > 65; --i)
    {
      System.out.println("Loop: " + i);
    }
  }
}