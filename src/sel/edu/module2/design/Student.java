package sel.edu.module2.design;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class Student
 * @version 1.0.0
 * @since 21.03.21 - 19, 32
 * */

/* Inheritance
1. Create a child  from the class Rectangle.
2. Create a class Person and a class Student as its daughter. 25 fields. */

/* 2. Create a class Person and a class Student as its daughter. 25 fields. */

public class Student extends Person{
    private String   identityDocument;
    private String   phoneNumber;
    private String   eMailAddress;
    public boolean   isAdult;
    private boolean  isConscript;
    private boolean  isDepartmentOfMilitaryTraining;
    private String   persuasion;
    private boolean  isPrivileged;
    private String   knowledgeOfForeignLanguages;
    private int      certificateMark;
    private int      ukrainianLanguageZNOResults;
    private int      englishLanguageZNOResults;
    private int      historyZNOResults;
    private boolean  isStateEmployee;
    private boolean  isScholar;
    private int      studentTicketNumber;
    private int      creditBookNumber;
    private String   speciality;
    private String   chair;
    private String   educationLevel;
    private boolean  isReTakesTheExams;
    private String   titleOfThesis;
    private String   supervisor;
    private String   specialCourses;
    private int      numberOfConferences;
    private int      numberOfScientificArticles;
    private boolean  participationInLegalClinic;
    private boolean  isSportsActivist;
    private boolean  isArtActivist;
    private String   specialAwards;
    private String   notes;

    public Student(String firstName, String lastName, String patronymic,
                   LocalDate dateOfBirth, String gender, String citizenship,
                   String identityDocument, String phoneNumber,
                   String eMailAddress, boolean isAdult, boolean isConscript,
                   boolean isDepartmentOfMilitaryTraining,
                   String persuasion, boolean isPrivileged,
                   String knowledgeOfForeignLanguages, int certificateMark,
                   int ukrainianLanguageZNOResults,
                   int englishLanguageZNOResults, int historyZNOResults,
                   boolean isStateEmployee, boolean isScholar,
                   int studentTicketNumber, int creditBookNumber,
                   String speciality, String chair, String educationLevel,
                   boolean isReTakesTheExams, String titleOfThesis,
                   String supervisor, String specialCourses,
                   int numberOfConferences, int numberOfScientificArticles,
                   boolean participationInLegalClinic,
                   boolean isSportsActivist, boolean isArtActivist,
                   String specialAwards, String notes) {
        super(firstName, lastName, patronymic, dateOfBirth,
              gender, citizenship);
        this.identityDocument = identityDocument;
        this.phoneNumber = phoneNumber;
        this.eMailAddress = eMailAddress;
        this.isAdult = isAdult;
        this.isConscript = isConscript;
        this.isDepartmentOfMilitaryTraining = isDepartmentOfMilitaryTraining;
        this.persuasion = persuasion;
        this.isPrivileged = isPrivileged;
        this.knowledgeOfForeignLanguages = knowledgeOfForeignLanguages;
        this.certificateMark = certificateMark;
        this.ukrainianLanguageZNOResults = ukrainianLanguageZNOResults;
        this.englishLanguageZNOResults = englishLanguageZNOResults;
        this.historyZNOResults = historyZNOResults;
        this.isStateEmployee = isStateEmployee;
        this.isScholar = isScholar;
        this.studentTicketNumber = studentTicketNumber;
        this.creditBookNumber = creditBookNumber;
        this.speciality = speciality;
        this.chair = chair;
        this.educationLevel = educationLevel;
        this.isReTakesTheExams = isReTakesTheExams;
        this.titleOfThesis = titleOfThesis;
        this.supervisor = supervisor;
        this.specialCourses = specialCourses;
        this.numberOfConferences = numberOfConferences;
        this.numberOfScientificArticles = numberOfScientificArticles;
        this.participationInLegalClinic = participationInLegalClinic;
        this.isSportsActivist = isSportsActivist;
        this.isArtActivist = isArtActivist;
        this.specialAwards = specialAwards;
        this.notes = notes;
    }

    /* ======================= Getters and setters. ======================== */

    public String getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
        this.identityDocument = identityDocument;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public boolean isConscript() {
        return isConscript;
    }

    public void setConscript(boolean conscript) {
        isConscript = conscript;
    }

    public boolean isDepartmentOfMilitaryTraining() {
        return isDepartmentOfMilitaryTraining;
    }

    public void setDepartmentOfMilitaryTraining(
            boolean departmentOfMilitaryTraining) {
        isDepartmentOfMilitaryTraining = departmentOfMilitaryTraining;
    }

    public String getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(String persuasion) {
        this.persuasion = persuasion;
    }

    public boolean isPrivileged() {
        return isPrivileged;
    }

    public void setPrivileged(boolean privileged) {
        isPrivileged = privileged;
    }

    public String getKnowledgeOfForeignLanguages() {
        return knowledgeOfForeignLanguages;
    }

    public void setKnowledgeOfForeignLanguages(
            String knowledgeOfForeignLanguages) {
        this.knowledgeOfForeignLanguages = knowledgeOfForeignLanguages;
    }

    public int getCertificateMark() {
        return certificateMark;
    }

    public void setCertificateMark(int certificateMark) {
        this.certificateMark = certificateMark;
    }

    public int getUkrainianLanguageZNOResults() {
        return ukrainianLanguageZNOResults;
    }

    public void setUkrainianLanguageZNOResults(
            int ukrainianLanguageZNOResults) {
        this.ukrainianLanguageZNOResults = ukrainianLanguageZNOResults;
    }

    public int getEnglishLanguageZNOResults() {
        return englishLanguageZNOResults;
    }

    public void setEnglishLanguageZNOResults(int englishLanguageZNOResults) {
        this.englishLanguageZNOResults = englishLanguageZNOResults;
    }

    public int getHistoryZNOResults() {
        return historyZNOResults;
    }

    public void setHistoryZNOResults(int historyZNOResults) {
        this.historyZNOResults = historyZNOResults;
    }

    public boolean isStateEmployee() {
        return isStateEmployee;
    }

    public void setStateEmployee(boolean stateEmployee) {
        isStateEmployee = stateEmployee;
    }

    public boolean isScholar() {
        return isScholar;
    }

    public void setScholar(boolean scholar) {
        isScholar = scholar;
    }

    public int getStudentTicketNumber() {
        return studentTicketNumber;
    }

    public void setStudentTicketNumber(int studentTicketNumber) {
        this.studentTicketNumber = studentTicketNumber;
    }

    public int getCreditBookNumber() {
        return creditBookNumber;
    }

    public void setCreditBookNumber(int creditBookNumber) {
        this.creditBookNumber = creditBookNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public boolean isReTakesTheExams() {
        return isReTakesTheExams;
    }

    public void setReTakesTheExams(boolean reTakesTheExams) {
        isReTakesTheExams = reTakesTheExams;
    }

    public String getTitleOfThesis() {
        return titleOfThesis;
    }

    public void setTitleOfThesis(String titleOfThesis) {
        this.titleOfThesis = titleOfThesis;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSpecialCourses() {
        return specialCourses;
    }

    public void setSpecialCourses(String specialCourses) {
        this.specialCourses = specialCourses;
    }

    public int getNumberOfConferences() {
        return numberOfConferences;
    }

    public void setNumberOfConferences(int numberOfConferences) {
        this.numberOfConferences = numberOfConferences;
    }

    public int getNumberOfScientificArticles() {
        return numberOfScientificArticles;
    }

    public void setNumberOfScientificArticles(int numberOfScientificArticles) {
        this.numberOfScientificArticles = numberOfScientificArticles;
    }

    public boolean isParticipationInLegalClinic() {
        return participationInLegalClinic;
    }

    public void setParticipationInLegalClinic(
            boolean participationInLegalClinic) {
        this.participationInLegalClinic = participationInLegalClinic;
    }

    public boolean isSportsActivist() {
        return isSportsActivist;
    }

    public void setSportsActivist(boolean sportsActivist) {
        isSportsActivist = sportsActivist;
    }

    public boolean isArtActivist() {
        return isArtActivist;
    }

    public void setArtActivist(boolean artActivist) {
        isArtActivist = artActivist;
    }

    public String getSpecialAwards() {
        return specialAwards;
    }

    public void setSpecialAwards(String specialAwards) {
        this.specialAwards = specialAwards;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /* ========================== Equals method. =========================== */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return isAdult == student.isAdult &&
                isConscript == student.isConscript &&
                isDepartmentOfMilitaryTraining ==
                        student.isDepartmentOfMilitaryTraining &&
                isPrivileged == student.isPrivileged &&
                certificateMark == student.certificateMark &&
                ukrainianLanguageZNOResults ==
                        student.ukrainianLanguageZNOResults &&
                englishLanguageZNOResults ==
                        student.englishLanguageZNOResults &&
                historyZNOResults == student.historyZNOResults &&
                isStateEmployee == student.isStateEmployee &&
                isScholar == student.isScholar &&
                studentTicketNumber == student.studentTicketNumber &&
                creditBookNumber == student.creditBookNumber &&
                isReTakesTheExams == student.isReTakesTheExams &&
                numberOfConferences == student.numberOfConferences &&
                numberOfScientificArticles ==
                        student.numberOfScientificArticles &&
                participationInLegalClinic ==
                        student.participationInLegalClinic &&
                isSportsActivist == student.isSportsActivist &&
                isArtActivist == student.isArtActivist &&
                Objects.equals(identityDocument, student.identityDocument) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                Objects.equals(eMailAddress, student.eMailAddress) &&
                Objects.equals(persuasion, student.persuasion) &&
                Objects.equals(knowledgeOfForeignLanguages,
                        student.knowledgeOfForeignLanguages) &&
                Objects.equals(speciality, student.speciality) &&
                Objects.equals(chair, student.chair) &&
                Objects.equals(educationLevel, student.educationLevel) &&
                Objects.equals(titleOfThesis, student.titleOfThesis) &&
                Objects.equals(supervisor, student.supervisor) &&
                Objects.equals(specialCourses, student.specialCourses) &&
                Objects.equals(specialAwards, student.specialAwards) &&
                Objects.equals(notes, student.notes);
    }

    /* ============================ Hash method. =========================== */

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), identityDocument, phoneNumber,
                            eMailAddress, isAdult, isConscript,
                            isDepartmentOfMilitaryTraining, persuasion,
                            isPrivileged, knowledgeOfForeignLanguages,
                            certificateMark, ukrainianLanguageZNOResults,
                            englishLanguageZNOResults, historyZNOResults,
                            isStateEmployee, isScholar, studentTicketNumber,
                            creditBookNumber, speciality, chair,
                            educationLevel, isReTakesTheExams, titleOfThesis,
                            supervisor, specialCourses, numberOfConferences,
                            numberOfScientificArticles,
                            participationInLegalClinic, isSportsActivist,
                            isArtActivist, specialAwards, notes);
    }

    /* ========================= ToString method. ========================== */

    @Override
    public String toString() {
        return "Student{" +
                "identityDocument='" + identityDocument + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMailAddress='" + eMailAddress + '\'' +
                ", isAdult=" + isAdult +
                ", isConscript=" + isConscript +
                ", isDepartmentOfMilitaryTraining=" +
                   isDepartmentOfMilitaryTraining +
                ", persuasion='" + persuasion + '\'' +
                ", isPrivileged=" + isPrivileged +
                ", knowledgeOfForeignLanguages='" +
                   knowledgeOfForeignLanguages + '\'' +
                ", certificateMark=" + certificateMark +
                ", ukrainianLanguageZNOResults=" +
                   ukrainianLanguageZNOResults +
                ", englishLanguageZNOResults=" + englishLanguageZNOResults +
                ", historyZNOResults=" + historyZNOResults +
                ", isStateEmployee=" + isStateEmployee +
                ", isScholar=" + isScholar +
                ", studentTicketNumber=" + studentTicketNumber +
                ", creditBookNumber=" + creditBookNumber +
                ", speciality='" + speciality + '\'' +
                ", chair='" + chair + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", isReTakesTheExams=" + isReTakesTheExams +
                ", titleOfThesis='" + titleOfThesis + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", specialCourses='" + specialCourses + '\'' +
                ", numberOfConferences=" + numberOfConferences +
                ", numberOfScientificArticles=" + numberOfScientificArticles +
                ", participationInLegalClinic=" + participationInLegalClinic +
                ", isSportsActivist=" + isSportsActivist +
                ", isArtActivist=" + isArtActivist +
                ", specialAwards='" + specialAwards + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}

//*************************THANK YOU FOR ATTENTION!**************************\\