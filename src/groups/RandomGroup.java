/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package groups;

import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 *
 * @author INTEX INFO
 */
public class RandomGroup {
 
    protected List<Student> students;
    protected int numberOfGroups;
    protected int maxInGroup;
    protected Group []groups;
    
    public RandomGroup(List<Student> students, int n, int max){
        this.students = students;
        this.numberOfGroups = n;
        this.maxInGroup = max;
    }
    public RandomGroup(List<Student> students, int n) {
        this.students = students;
        this.numberOfGroups = n;
    }
    
    public RandomGroup(List<Student> students) {
        this.students = students;
    }
    
    /**
     * 
     * @return 
     */
    public Group[] getGroups(){
        if(this.groups.length > 0)
            return this.groups;
        
        Group []grps = new Group[this.getNumberOfGroups()];
        List<Student> boys = Student.selectOnlyBoys(students);
        List<Student> girls = Student.selectOnlyGirls(students);
        ListIterator<Student> boysItr = boys.listIterator();
        ListIterator<Student> girlsItr = girls.listIterator();
           
            // get random 0 < b < boys.size
            while(boysItr.hasNext()){
                Random rand = new Random();
                int randomNum = rand.nextInt((boys.size()) + 1);
                grps[0] = new Group();
                grps[0].students.add(boys.get(randomNum));
                
            }
            // use this j for boys group i 
        return grps;
    }
    /**
     * Return the number of groups based in the number
     * of students and the max of one groups
     * @return 
     */
    public int getGroupsNumber(){
        
        
        return 0;
    }
    public int getNumberOfGroups(){
        /*if(this.numberOfGroups > 0)
            return this.numberOfGroups;
        int n = this.students.size()-1; // 1 is the raw of labels*/
        return this.numberOfGroups;
    }
}
