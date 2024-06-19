public class Validator {
    public boolean isValidPassword(String input){
        if(input.length()!=8){
            System.out.println("Password must be 8 characters long.");
            return false;
        }
        if(!input.matches("[a-zA-Z0-9]+")){
            System.out.println("Password must only contain letters and digits");
            return false;
        }
        int digitcount = 0;
        for(char c: input.toCharArray()){
            if(Character.isDigit(c)){
                digitcount++;
            }
        }
        if(digitcount!=2){
            System.out.println("Password must contain two digits.");
            return false;
        }
        return true;
    }
}
