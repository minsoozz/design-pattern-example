package decoratorV2;

public class RealComponent implements Component{

    @Override
    public String operation() {
        System.out.println("RealComponent 실행");
        return "operation";
    }
}
