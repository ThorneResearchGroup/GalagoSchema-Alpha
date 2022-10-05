package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;

import java.util.Date;

public class PersonEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private ImageEntity primaryImage;

    private String title;

    private String firstName;

    private String middleName;

    private String lastName;

    private String birthday;

    private LocationEntity birthPlace;

    private String alias;

    private Long views;

    public PersonEntity() {
    }

    public PersonEntity(@Deserialize("created") Date created,
                        @Deserialize("updated") Date updated,
                        @Deserialize("id") Long id,
                        @Deserialize("lockType") LockType lockType,
                        @Deserialize("primaryImage") ImageEntity primaryImage,
                        @Deserialize("title") String title,
                        @Deserialize("firstName") String firstName,
                        @Deserialize("middleName") String middleName,
                        @Deserialize("lastName") String lastName,
                        @Deserialize("birthday") String birthday,
                        @Deserialize("birthPlace") LocationEntity birthPlace,
                        @Deserialize("alias") String alias,
                        @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.primaryImage = primaryImage;
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.birthPlace = birthPlace;
        this.alias = alias;
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
    public LockType getLockType() {
        return lockType;
    }

    @Serialize(order = 4)
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getTitle() {
        return title;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getFirstName() {
        return firstName;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getMiddleName() {
        return middleName;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public String getLastName() {
        return lastName;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public String getBirthday() {
        return birthday;
    }

    @Serialize(order = 10)
    public LocationEntity getBirthPlace() {
        return birthPlace;
    }

    @Serialize(order = 11)
    @SerializeNullable
    public String getAlias() {
        return alias;
    }

    @Serialize(order = 12)
    @SerializeNullable
    public Long getViews() {
        return views;
    }

    @Override
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setLockType(LockType lockType) {
        this.lockType = lockType;
    }

    public void setPrimaryImage(ImageEntity primaryImage) {
        this.primaryImage = primaryImage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBirthPlace(LocationEntity birthPlace) {
        this.birthPlace = birthPlace;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
