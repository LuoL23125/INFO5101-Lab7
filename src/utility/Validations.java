/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import javax.swing.JOptionPane;

/**
 *
 * @author luole
 */
public class Validations {

    public static String validateStudentForm(String name, int age, String college, String phone, String continent, String experience) {

        // Validate first name
        // Check if firstname is blank
        if (name.isBlank()) {
            return "Name can not be empty!";
        }
        //check first name only contains letter and space
        if (!name.matches("[a-zA-Z\\s]+")) {
            return "Name can only contain letters and spaces!";
        }
        // Validate last name
        // Check if lastname is blank

        //check last name only contains letter and space
        // Validate age
        if (age <= 0) {
            return "Age must be greater than 0!";
        }
        // Validate gender selection
        if (college == null) {
            return "Please select a college!";
        }

        // Validate phone number
        String cleanPhone = phone.replaceAll("[\\s\\-\\(\\)]", "");
        if (phone.isBlank() || !cleanPhone.matches("\\d{10,15}")) {
            return "Invalid phone number provided!";
            }
        // Validate Hobbies
        if (experience == null || experience.isBlank()) {
            return "Please write down your experience";
        }
        // validate continent
        if (continent == null || continent.isBlank()) {
            return "Please select a continent";
        }

        return null;
    }
}
