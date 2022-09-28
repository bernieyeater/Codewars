package package1;

public class D20220928_thinkful_drills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String current="yellow";
		String nextState="";
		if (current.equalsIgnoreCase("green")) nextState="yellow";
		if (current.equalsIgnoreCase("red")) nextState="green";
		if (current.equalsIgnoreCase("yellow")) nextState="red";
	}

}
/*
You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.

For example, when the input is green, output should be yellow.
Others
public class TrafficLights {

  public static String updateLight(String current) {
    switch (current) {
      case "red": return "green";
      case "yellow": return "red";
      case "green": return "yellow";
      default: throw new IllegalArgumentException();
    }
  }

}
*/