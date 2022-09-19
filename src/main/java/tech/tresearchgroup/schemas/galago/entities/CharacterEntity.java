package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;

import java.util.Date;

@Data
@NoArgsConstructor
public class CharacterEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String title;

    private String firstName;

    private String middleName;

    private String lastName;

    private String birthday;

    private String alias;

    private PersonEntity playedBy;

    private Long views;

    public CharacterEntity(@Deserialize("created") Date created,
                           @Deserialize("updated") Date updated,
                           @Deserialize("id") Long id,
                           @Deserialize("title") String title,
                           @Deserialize("firstName") String firstName,
                           @Deserialize("middleName") String middleName,
                           @Deserialize("lastName") String lastName,
                           @Deserialize("birthday") String birthday,
                           @Deserialize("alias") String alias,
                           @Deserialize("playedBy") PersonEntity playedBy,
                           @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.alias = alias;
        this.playedBy = playedBy;
        this.views = views;
    }

    @Serialize(order = 0)
    @SerializeNullable
    public Date getCreated() {
        return created;
    }

    @Serialize(order = 1)
    @SerializeNullable
    public Date getUpdated() {
        return updated;
    }

    @Serialize(order = 2)
    @SerializeNullable
    public Long getId() {
        return id;
    }

    @Serialize(order = 3)
    @SerializeNullable
    public String getTitle() {
        return title;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public String getFirstName() {
        return firstName;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getMiddleName() {
        return middleName;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getLastName() {
        return lastName;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getBirthday() {
        return birthday;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public String getAlias() {
        return alias;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public PersonEntity getPlayedBy() {
        return playedBy;
    }

    @Serialize(order = 10)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
