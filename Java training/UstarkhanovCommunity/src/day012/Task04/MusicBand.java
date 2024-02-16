package day012.Task04;

import java.util.List;

public class MusicBand {
    private String nameBand;
    private int year;
    private List<String> nameArtist;
    public MusicBand(String nameBand, int year, List<String> nameArtist){
        this.nameBand = nameBand;
        this.year = year;
        this.nameArtist = nameArtist;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameBand() {
        return nameBand;
    }

    public void setNameBand(String nameBand) {
        this.nameBand = nameBand;
    }

    public List<String> getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(List<String> nameArtist) {
        this.nameArtist = nameArtist;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", year=" + year +
                ", nameArtist='" + this.nameArtist + '\'' +
                '}';
    }
    public void addArtist(String name){
        nameArtist.add(name);
    }
    public void removeArtist(String name){
        nameArtist.remove(name);
    }

    public void printListArtistBand(){
        System.out.println(this.nameArtist);
    }

    public static void transferMembers(MusicBand mb1, MusicBand mb2){
        mb2.nameArtist.addAll(mb1.nameArtist);//Можно было и циклом
        //циклом добавляем
//        for (String nameArtist: mb1.getNameArtist()){
//            mb2.nameArtist.add(nameArtist);
//        }
        mb1.nameArtist.clear();
    }
    //Можно было трансфер сделать не статическим
//    public void transferMembers(MusicBand mb2){
//        mb2.nameArtist.addAll(mb1.nameArtist);//Можно было и циклом
//        //циклом добавляем
////        for (String nameArtist: this.getNameArtist()){
////            mb2.nameArtist.add(nameArtist);
////        }
//        this.nameArtist.clear();

}
