package com.nitish.excersize;
class LegacyApi {
    @Deprecated
    public void oldFeature(){
        System.out.println("old feature");
    }
    public void newFeature(){
        System.out.println("new Feature!");
    }
}


public class MarkAnOldMethod {
    public static void main(String[] args) {
        LegacyApi api = new LegacyApi();
        api.oldFeature();
        System.out.println();
        api.newFeature();
    }

}
