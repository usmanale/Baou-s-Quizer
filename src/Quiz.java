
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baou usman
 */
public class Quiz implements java.io.Serializable{
    public String Title;
    public String Description;
    public List <String> QType;
    public List <String> Questions;
    public List <String> Marks;
    public List <String> Answers;
    public List <String> CAnswers;
}
