package chap08.ChallengeTask03;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String toString()
    {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.toString() == model)
        {
            return true;
        }
        return false;
    }
}
