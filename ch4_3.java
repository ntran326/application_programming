// Nhu Tran

public class ch4_3 {

    public static void main(String[] args) {
        
        // Atlanta
        double x1 = 33.7489954;
        double y1 = -84.3879824;
 
        // Orlando
        double x2 = 28.538336;
        double y2 = -81.379234;
 

        // Savannah
        double x3 = 32.076176;
        double y3 = -81.088371;
        

        // Charlotte
        double x4 = 35.227085;
        double y4 = -80.843124;
        

        double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        

        
        side1 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        side2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        side3 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) + area;
        
        System.out.print("The area enclosed by 4 cities is " + area + " km^2");
        
    }
}
