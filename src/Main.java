import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        //создаем директории
        File src = new File("C://Users//lisit//IdeaProjects//Games//src");
        text.append(src.getName() + " создан: " + src.mkdir() + "\n");
        File res = new File("C://Users//lisit//IdeaProjects//Games//res");
        text.append(res.getName() + " создан: " + res.mkdir() + "\n");
        File saveGames = new File("C://Users//lisit//IdeaProjects//Games//savegames");
        text.append(saveGames.getName() + " создан: " + saveGames.mkdir() + "\n");

        File temp = new File("C://Users//lisit//IdeaProjects//Games//temp");
        text.append(temp.getName() + " создан: " + temp.mkdir() + "\n");
        File main = new File("C://Users//lisit//IdeaProjects//Games//src//main");
        text.append(main.getName() + " создан: " + main.mkdir() + "\n");
        File test = new File("C://Users//lisit//IdeaProjects//Games//src//test");
        text.append(test.getName() + " создан: " + test.mkdir() + "\n");
        File drawables = new File("C://Users//lisit//IdeaProjects//Games//res//drawables");
        text.append(drawables.getName() + " создан: " + drawables.mkdir() + "\n");
        File vectors = new File("C://Users//lisit//IdeaProjects//Games//res//vectors");
        text.append(vectors.getName() + " создан: " + vectors.mkdir() + "\n");
        File icons = new File("C://Users//lisit//IdeaProjects//Games//res//icons");
        text.append(icons.getName() + " создан: " + icons.mkdir() + "\n");

        //создаем файлы
        try {
            File mainJava = new File("C://Users//lisit//IdeaProjects//Games//src//main", "Main.java");
            text.append(mainJava.getName() + " создан: " + mainJava.createNewFile() + "\n");
            File utilsJava = new File("C://Users//lisit//IdeaProjects//Games//src//main", "Utils.java");
            text.append(utilsJava.getName() + " создан: " + utilsJava.createNewFile() + "\n");
            File tempTxt = new File("C://Users//lisit//IdeaProjects//Games//temp", "temp.txt");
            text.append(tempTxt.getName() + " создан: " + tempTxt.createNewFile() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String textStr = text.toString();

        //записываем текст в temp
        try (FileWriter writer = new FileWriter("C://Users//lisit//IdeaProjects//Games//temp//temp.txt", true)) {
            writer.write(textStr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
