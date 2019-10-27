package pl.jnowacki.model;

import java.time.LocalDate;
import java.util.List;

public class Director extends Person{

    private List<Award> bestDirectorAward;

    public Director(String name, LocalDate birthDate, Gender gender, List<Award> bestDirectorAward) {
        super(name, birthDate, gender);
        this.bestDirectorAward = bestDirectorAward;
    }

    public Director(String name, LocalDate birthDate, LocalDate deathDate, Gender gender, List<Award> bestDirectorAward) {
        super(name, birthDate, deathDate, gender);
        this.bestDirectorAward = bestDirectorAward;
    }

    public List<Award> getBestDirectorAward() {
        return bestDirectorAward;
    }

    public void setBestDirectorAward(List<Award> bestDirectorAward) {
        this.bestDirectorAward = bestDirectorAward;
    }
}
