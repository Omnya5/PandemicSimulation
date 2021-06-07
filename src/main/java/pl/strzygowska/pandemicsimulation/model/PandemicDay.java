package pl.strzygowska.pandemicsimulation.model;

import javax.persistence.*;

@Entity
public class PandemicDay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "infected")
    private Long Pi;

    @Column(name = "healthy")
    private Long Pv;

    @Column(name = "dead")
    private Long Pm;

    @Column(name = "recovered")
    private Long Pr;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "simulation_id")
    private Simulation simulation;

    public PandemicDay() {
    }

    public PandemicDay(Simulation simulation, Long Pi, Long Pv, Long Pm, Long Pr) {
        this.simulation = simulation;
        this.Pi = Pi;
        this.Pv = Pv;
        this.Pm = Pm;
        this.Pr = Pr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPi() {
        return Pi;
    }

    public void setPi(Long Pi) {
        this.Pi = Pi;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long Pv) {
        this.Pv = Pv;
    }

    public Long getPm() {
        return Pm;
    }

    public void setPm(Long Pm) {
        this.Pm = Pm;
    }

    public Long getPr() {
        return Pr;
    }

    public void setPr(Long Pr) {
        this.Pr = Pr;
    }
}
