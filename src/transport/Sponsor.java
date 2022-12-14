package transport;

import java.util.HashSet;
import java.util.Set;

public class Sponsor {
    private String sponsorName;
    private float sponsorshipAmount;
    private Set<Transport> sponsorsCars;

    public Sponsor(String sponsorName, float sponsorshipAmount) {
        this.sponsorName = sponsorName;
        this.sponsorshipAmount = sponsorshipAmount;
        this.sponsorsCars = new HashSet<>();
    }

    public Set<Transport> getSponsorsCars() {
        return sponsorsCars;
    }

    public void setSponsorsCars(Set<Transport> sponsorsCars) {
        this.sponsorsCars = sponsorsCars;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "sponsorName='" + sponsorName + '\'' +
                ", sponsorshipAmount=" + sponsorshipAmount +
                '}';
    }

    public String sponsorRace(){
        return "Заезд проспонсировал " + getSponsorName() + " на сумму " + getSponsorshipAmount();
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public float getSponsorshipAmount() {
        return sponsorshipAmount;
    }

    public void setSponsorshipAmount(float sponsorshipAmount) {
        this.sponsorshipAmount = sponsorshipAmount;
    }
}
