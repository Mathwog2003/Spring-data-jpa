package com.jpalearn.jpa.Entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
@AttributeOverrides(
        {
                @AttributeOverride(
                        name = "name",
                        column = @Column(name = "guardian_name")
                ),
                @AttributeOverride(
                        name="email",
                        column = @Column(name = "guardian_mail_id")
                ),
                @AttributeOverride(
                        name="mobile",
                        column = @Column(name = "guardian_mobile")
                )

        }
)
public class Guardian {

    private String name;
    private String email;
    private String mobile;
}
