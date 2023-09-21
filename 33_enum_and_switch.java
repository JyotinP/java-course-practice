// Enum is a class. The values are all objects.
enum Status{
    Runnning, Failed, Pending, Success;
}

class EnumSwitch{
    public static void main(String args[]){

        Status s = Status.Pending;
        System.out.println(s + " | " + s.ordinal()); // res: Pending

        // Switch is used as an alternative to IF ELSE statement. its similar to CASE WHEN

        Status stat = Status.Success;

        switch(stat){
            case Runnning:
            System.out.println("running..");
            break;
            
            case Failed:
            System.out.println("try again");
            break;
            
            case Pending:
            System.out.println("wait..");
            break;
            
            default:
            System.out.println("completed");
            break;
        }

    }
}
