package nendrasys.lambdaExpression;

@FunctionalInterface
interface  FunctionalInterfaceEx
{
    void hello();

}


public class ImplementationForFUnctionalinterface {

    public static void main(String args[])
    {
        FunctionalInterfaceEx functionalInterfaceEx=()->
        {
            System.out.println("hello saurav kumar");
        };


        functionalInterfaceEx.hello();
    }


}
