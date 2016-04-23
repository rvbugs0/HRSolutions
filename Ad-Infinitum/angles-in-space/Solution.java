import java.io.*;
import java.util.*;

class Point
{
public int x,y,z;
public Point(int x,int y, int z)
{
	this.x=x;
	this.y=y;
	this.z=z;
}
}



public class Solution {
    public static double CosAngle(Point p1,Point p2,Point p3)
    {
        double p= ((p1.x-p2.x)*(p3.x-p2.x))+((p1.y-p2.y)*(p3.y-p2.y))+((p1.z-p2.z)*(p3.z-p2.z));
        double a1= Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2)+Math.pow((p2.z-p1.z),2);
        double a2= Math.pow((p3.x-p2.x),2)+Math.pow((p3.y-p2.y),2)+Math.pow((p3.z-p2.z),2);
        double a3=Math.pow(a1,0.5)*Math.pow(a2,0.5);
        return  Math.acos(p/a3);
    }



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Point> points=new ArrayList<Point>();
        for(int i=0;i<n;i++)
        {
        	String[] s=sc.nextLine().split(" ");
        	int x=Integer.parseInt(s[0]);
        	int y=Integer.parseInt(s[1]);
        	int z=Integer.parseInt(s[2]);
        	points.add(new Point(x,y,z));

        }
        int i=0,j=0,k=0;
        int m=3;
        double sum=0;
        int count=0;
    for(i=1;i<=(n-m+1);i++)
    {
        for( j=i+1;j<n;j++)
        {
            k=j+1;

            while(k<=n)
            {
//                sum=sum+
                double ca=CosAngle(points.get(i-1),points.get(j-1),points.get(k-1));
                //System.out.println("CA "+ ca);
                sum=sum+ca;
                k++;
                count++;
            }
        }

    }

    System.out.println(sum/count);


    }
}



