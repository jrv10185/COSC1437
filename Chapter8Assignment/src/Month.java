public class Month {
    private int monthNumber =0;
    
    public Month(int mth){
        monthNumber = 1;
        if(mth >= 1 || mth <= 12){
            monthNumber = mth;
        }
    }
    public void setMonthNumber(int mth){
        monthNumber = 1;
        if(mth >= 1 || mth <= 12){
            monthNumber = mth;
        }
    }
    public int getMonthNumber(){
        return monthNumber;
    }
    public String getMonthName(){
        String[] monthNameArray = new String[]{"January", "February", "March", "April", "May", "June", "July","August","September","October","November","December"};
        return monthNameArray[monthNumber-1];
    }
    public String getSeason(){
        String season = "";
        if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2){
            season = "Winter";
        }
        if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
            season = "Spring";
        }
        if(monthNumber == 6 || monthNumber == 7 || monthNumber == 8){
            season = "Summer";
        }
        if(monthNumber == 9 || monthNumber == 10 || monthNumber == 11){
            season = "Fall";
        }
        return season;
    }
    public String toString(){
      String str = "Month Number: " + monthNumber +
                   "\nMonth Name: " + getMonthName()+
                   "\nSeason: " + getSeason();
      return str;
   }                 
    public boolean equals(Month obj2){
        boolean status;
        if(monthNumber == obj2.monthNumber){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
}
