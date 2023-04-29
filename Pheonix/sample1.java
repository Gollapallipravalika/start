public class Sample1
{
public static void main(String[] args)
{
String[] arr={"biryani","kabab","curry","chatni"};
System.out.println(arr.length);
System.out.println("sl.no\t recipe");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+1+"\t"+arr[i]);
}
}
}