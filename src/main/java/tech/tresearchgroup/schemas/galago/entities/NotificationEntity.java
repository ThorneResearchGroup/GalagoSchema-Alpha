package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.enums.NotificationErrorTypeEnum;

import java.util.Date;

@Data
@NoArgsConstructor
public class NotificationEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private Long userEntity;

    private NotificationErrorTypeEnum notificationErrorTypeEnum;
    private boolean unread;

    private String name;

    private String body;

    public NotificationEntity(@Deserialize("created") Date created,
                              @Deserialize("updated") Date updated,
                              @Deserialize("id") Long id,
                              @Deserialize("userEntity") Long userEntity,
                              @Deserialize("notificationErrorTypeEnum") NotificationErrorTypeEnum notificationErrorTypeEnum,
                              @Deserialize("unread") boolean unread,
                              @Deserialize("name") String name,
                              @Deserialize("body") String body) {
        this.created = created;
        this.updated = updated;
        this.id = id;
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
    public Long getUserEntity() {
        return userEntity;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public NotificationErrorTypeEnum getNotificationErrorTypeEnum() {
        return notificationErrorTypeEnum;
    }

    @Serialize(order = 5)
    public boolean isUnread() {
        return unread;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getName() {
        return name;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getBody() {
        return body;
    }
}
