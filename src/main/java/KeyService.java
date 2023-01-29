import org.jnativehook.keyboard.NativeKeyEvent;

public class KeyService {
    public String isNumber(int keyCode){
        if (keyCode == NativeKeyEvent.VC_0){
            return "0";
        }
        if (keyCode == NativeKeyEvent.VC_1){
            return "1";
        }
        if (keyCode == NativeKeyEvent.VC_2){
            return "2";
        }
        if (keyCode == NativeKeyEvent.VC_3){
            return "3";
        }
        if (keyCode == NativeKeyEvent.VC_4){
            return "4";
        }
        if (keyCode == NativeKeyEvent.VC_5){
            return "5";
        }
        if (keyCode == NativeKeyEvent.VC_6){
            return "6";
        }
        if (keyCode == NativeKeyEvent.VC_7){
            return "7";
        }
        if (keyCode == NativeKeyEvent.VC_8){
            return "8";
        }
        if (keyCode == NativeKeyEvent.VC_9){
            return "9";
        }
        return "";
    }
    public String isLetter(int keyCode){
        //TODO: Continue  enum for letter with variables https://www.baeldung.com/java-enum-values
        //First layer
        if (keyCode == KeyLetter.Q.getValue()){
            return "q";
        }
        if (keyCode == KeyLetter.W.getValue()){
            return "w";
        }
        if (keyCode == KeyLetter.E.getValue()){
            return "e";
        }
        if (keyCode == KeyLetter.R.getValue()){
            return "r";
        }
        if (keyCode == KeyLetter.T.getValue()){
            return "t";
        }
        if (keyCode == KeyLetter.Y.getValue()){
            return "y";
        }
        if (keyCode == KeyLetter.U.getValue()){
            return "u";
        }
        if (keyCode == KeyLetter.I.getValue()){
            return "i";
        }
        if (keyCode == KeyLetter.O.getValue()){
            return "o";
        }
        if (keyCode == KeyLetter.P.getValue()){
            return "p";
        }
        //Second layer
        if (keyCode == 30){
            return "a";
        }

        if (keyCode == 31){
            return "s";
        }
        if (keyCode == 32){
            return "d";
        }
        if (keyCode == 33){
            return "f";
        }
        if (keyCode == 34){
            return "g";
        }
        if (keyCode == 35){
            return "h";
        }
        if (keyCode == 36){
            return "j";
        }
        if (keyCode == 37){
            return "k";
        }
        if (keyCode == 38){
            return "l";
        }
        //Third layer
        if (keyCode == 44){
            return "z";
        }
        if (keyCode == 45){
            return "x";
        }
        if (keyCode == 46){
            return "c";
        }
        if (keyCode == 47){
            return "v";
        }
        if (keyCode == 48){
            return "b";
        }
        if (keyCode == 49){
            return "n";
        }
        if (keyCode == 50){
            return "m";
        }
        return "";
    }
    public String isSymbol(){
        return "";
    }
    public void isFuncKeyboardKey(){

    }
}
