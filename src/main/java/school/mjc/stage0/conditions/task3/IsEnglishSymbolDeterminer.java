package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String english = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        if (english.indexOf(symbol) != -1){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
