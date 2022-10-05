package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;
import tech.tresearchgroup.schemas.galago.enums.NotificationErrorTypeEnum;

import java.util.Date;

public class NotificationEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private Long userEntity;

    private NotificationErrorTypeEnum notificationErrorTypeEnum;
    private boolean unread;

    private String name;

    private String body;

    public NotificationEntity() {
    }

    public NotificationEntity(@Deserialize("created") Date created,
                              @Deserialize("updated") Date updated,
                              @Deserialize("id") Long id,
                              @Deserialize("lockType") LockType lockType,
                              @Deserialize("userEntity") Long userEntity,
                              @Deserialize("notificationErrorTypeEnum") NotificationErrorTypeEnum notificationErrorTypeEnum,
                              @Deserialize("unread") boolean unread,
                              @Deserialize("name") String name,
                              @Deserialize("body") String body) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.userEntity = userEntity;
        this.notificationErrorTypeEnum = notificationErrorTypeEnum;
        this.unread = unread;
        this.name = name;
        this.body = body;
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
    @SerializeNullable
    public Long getUserEntity() {
        return userEntity;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public NotificationErrorTypeEnum getNotificationErrorTypeEnum() {
        return notificationErrorTypeEnum;
    }

    @Serialize(order = 6)
    public boolean isUnread() {
        return unread;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getName() {
        return name;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public String getBody() {
        return body;
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

    public void setUserEntity(Long userEntity) {
        this.userEntity = userEntity;
    }

    public void setNotificationErrorTypeEnum(NotificationErrorTypeEnum notificationErrorTypeEnum) {
        this.notificationErrorTypeEnum = notificationErrorTypeEnum;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
