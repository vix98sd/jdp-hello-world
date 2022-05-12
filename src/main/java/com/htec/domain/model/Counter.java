package com.htec.domain.model;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "Counter")
@Table(name = "counter")
public class Counter {
    @Id
    @SequenceGenerator(
            name = "counterSequence",
            sequenceName = "counterSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "counterSequence"
    )
    private Long id;
    private Long value = 0L;

    public void incrementValue() {
        this.value++;
    }

    @Override
    public String toString() {
        return "Current counter value: " + this.value;
    }
}
