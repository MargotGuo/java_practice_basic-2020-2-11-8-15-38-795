public enum Student {
  LINDA("Linda", Gender.FEMALE),
  BOB("Bob",Gender.MALE),
  SOLIDER("Solider", Gender.MALE),
  CINDY("Cindy", Gender.FEMALE);

  private final String name;
  private final Gender gender;

  Student(String name, Gender gender) {
    this.name = name;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender.getDescription();
  }
}
