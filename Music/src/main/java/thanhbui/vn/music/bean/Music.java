package thanhbui.vn.music.bean;

import java.util.List;

public class Music {
    private String name;
    private String single;
    private List<String> category;
    private String pathMusic;

    public Music() {
    }
    public Music(String name, String single, String pathMusic) {
        this.name = name;
        this.single = single;
        this.pathMusic = pathMusic;
    }
    public Music(String name, String single, List<String> category, String pathMusic) {
        this.name = name;
        this.single = single;
        this.category = category;
        this.pathMusic = pathMusic;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public String getPathMusic() {
        return pathMusic;
    }

    public void setPathMusic(String pathMusic) {
        this.pathMusic = pathMusic;
    }
    public String displayMusic(){
        if (category == null){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag =true;
        for(String c: category){
            if (flag){
                flag = false;
            }else {
                stringBuilder.append(",");
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
