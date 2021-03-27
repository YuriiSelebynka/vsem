package sel.edu.module2.design;

import sel.edu.module2.model.Student2;

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


/* Programming patterns. Factory, Builder.

Develop for your class:
1. Factory;
2. Abstract factory;
3. Create a builder for the class Student;
4. Create a class MyInteger.
   Design a method  public static boolean isPrime(int num). */

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

    public Student() {
        //super();
    }

    public Student(
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

/* Module II. 3. Create a builder for the class Student. */

/*=================== Creating Builder for class Student. ===================*/

    public static class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

/*================== Creating method SimilarTo for Builder. =================*/

        public Builder setSimilarTo (Student student) {
            /*this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.dateOfBirth = student.dateOfBirth;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.citizenship = student.citizenship;*/

            this.studentToBuild.identityDocument = student.identityDocument;
            this.studentToBuild.phoneNumber = student.phoneNumber;
            this.studentToBuild.eMailAddress = student.eMailAddress;
            this.studentToBuild.isAdult = student.isAdult;
            this.studentToBuild.isConscript = student.isConscript;
            this.studentToBuild.isDepartmentOfMilitaryTraining = student
                    .isDepartmentOfMilitaryTraining;
            this.studentToBuild.persuasion = student.persuasion;
            this.studentToBuild.isPrivileged = student.isPrivileged;
            this.studentToBuild.knowledgeOfForeignLanguages = student
                    .knowledgeOfForeignLanguages;
            this.studentToBuild.certificateMark = student.certificateMark;
            this.studentToBuild.ukrainianLanguageZNOResults = student
                    .ukrainianLanguageZNOResults;
            this.studentToBuild.englishLanguageZNOResults = student
                    .englishLanguageZNOResults;
            this.studentToBuild.historyZNOResults = student.historyZNOResults;
            this.studentToBuild.isStateEmployee = student.isStateEmployee;
            this.studentToBuild.isScholar = student.isScholar;
            this.studentToBuild.studentTicketNumber = student
                    .studentTicketNumber;
            this.studentToBuild.creditBookNumber = student.creditBookNumber;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.chair = student.chair;
            this.studentToBuild.educationLevel = student.educationLevel;
            this.studentToBuild.isReTakesTheExams = student.isReTakesTheExams;
            this.studentToBuild.titleOfThesis = student.titleOfThesis;
            this.studentToBuild.supervisor = student.supervisor;
            this.studentToBuild.specialCourses = student.specialCourses;
            this.studentToBuild.numberOfConferences = student
                    .numberOfConferences;
            this.studentToBuild.numberOfScientificArticles = student
                    .numberOfScientificArticles;
            this.studentToBuild.participationInLegalClinic = student
                    .participationInLegalClinic;
            this.studentToBuild.isSportsActivist = student.isSportsActivist;
            this.studentToBuild.isArtActivist = student.isArtActivist;
            this.studentToBuild.specialAwards = student.specialAwards;
            this.studentToBuild.notes = student.notes;
            return this;
        }

/*================ Creating another methods for class Student. ==============*/

        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth){
            studentToBuild.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Builder setGender(String gender){
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setCitizenship(String citizenship){
            studentToBuild.setCitizenship(citizenship);
            return this;
        }

        public Builder setIdentityDocument(String identityDocument){
            studentToBuild.setIdentityDocument(identityDocument);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber){
            studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }

        public Builder setEMailAddress(String eMailAddress){
            studentToBuild.seteMailAddress(eMailAddress);
            return this;
        }

        public Builder setAdult(boolean isAdult){
            studentToBuild.setAdult(isAdult);
            return this;
        }

        public Builder setConscript(boolean isConscript){
            studentToBuild.setConscript(isConscript);
            return this;
        }

        public Builder setDepartmentOfMilitaryTraining(
                boolean isDepartmentOfMilitaryTraining){
            studentToBuild.setDepartmentOfMilitaryTraining(
                    isDepartmentOfMilitaryTraining);
            return this;
        }

        public Builder setPersuasion(String persuasion){
            studentToBuild.setPersuasion(persuasion);
            return this;
        }

        public Builder setPrivileged(boolean isPrivileged){
            studentToBuild.setPrivileged(isPrivileged);
            return this;
        }

        public Builder setKnowledgeOfForeignLanguages(
                String knowledgeOfForeignLanguages){
            studentToBuild.setKnowledgeOfForeignLanguages(
                    knowledgeOfForeignLanguages);
            return this;
        }

        public Builder setCertificateMark(int certificateMark){
            studentToBuild.setCertificateMark(certificateMark);
            return this;
        }

        public Builder setUkrainianLanguageZNOResults(
                int ukrainianLanguageZNOResults){
            studentToBuild.setUkrainianLanguageZNOResults(
                    ukrainianLanguageZNOResults);
            return this;
        }

        public Builder setEnglishLanguageZNOResults(
                int englishLanguageZNOResults){
            studentToBuild.setEnglishLanguageZNOResults(
                    englishLanguageZNOResults);
            return this;
        }

        public Builder setHistoryZNOResults(int historyZNOResults){
            studentToBuild.setHistoryZNOResults(historyZNOResults);
            return this;
        }

        public Builder setStateEmployee(boolean isStateEmployee){
            studentToBuild.setStateEmployee(isStateEmployee);
            return this;
        }

        public Builder setScholar(boolean isScholar){
            studentToBuild.setScholar(isScholar);
            return this;
        }

        public Builder setStudentTicketNumber(int studentTicketNumber){
            studentToBuild.setStudentTicketNumber(studentTicketNumber);
            return this;
        }

        public Builder setCreditBookNumber(int creditBookNumber){
            studentToBuild.setCreditBookNumber(creditBookNumber);
            return this;
        }

        public Builder setSpeciality(String speciality){
            studentToBuild.setSpeciality(speciality);
            return this;
        }

        public Builder setChair(String chair){
            studentToBuild.setChair(chair);
            return this;
        }

        public Builder setEducationLevel(String educationLevel){
            studentToBuild.setEducationLevel(educationLevel);
            return this;
        }

        public Builder setReTakesTheExams(boolean isReTakesTheExams){
            studentToBuild.setReTakesTheExams(isReTakesTheExams);
            return this;
        }

        public Builder setTitleOfThesis(String titleOfThesis){
            studentToBuild.setTitleOfThesis(titleOfThesis);
            return this;
        }

        public Builder setSupervisor(String supervisor){
            studentToBuild.setSupervisor(supervisor);
            return this;
        }

        public Builder setSpecialCourses(String specialCourses){
            studentToBuild.setSpecialCourses(specialCourses);
            return this;
        }

        public Builder setNumberOfConferences(int numberOfConferences){
            studentToBuild.setNumberOfConferences(numberOfConferences);
            return this;
        }

        public Builder setNumberOfScientificArticles(
                int numberOfScientificArticles){
            studentToBuild.setNumberOfScientificArticles(
                    numberOfScientificArticles);
            return this;
        }

        public Builder setParticipationInLegalClinic(
                boolean participationInLegalClinic){
            studentToBuild.setParticipationInLegalClinic(
                    participationInLegalClinic);
            return this;
        }

        public Builder setSportsActivist(boolean isSportsActivist){
            studentToBuild.setSportsActivist(isSportsActivist);
            return this;
        }

        public Builder setArtActivist(boolean isArtActivist){
            studentToBuild.setArtActivist(isArtActivist);
            return this;
        }

        public Builder setSpecialAwards(String specialAwards){
            studentToBuild.setSpecialAwards(specialAwards);
            return this;
        }

        public Builder setNotes(String notes){
            studentToBuild.setNotes(notes);
            return this;
        }


        public Student build() {
            return studentToBuild;
        }
    }
}

//*************************THANK YOU FOR ATTENTION!**************************\\