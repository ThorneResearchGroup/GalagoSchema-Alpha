package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;
import tech.tresearchgroup.schemas.galago.enums.QueueStateEnum;
import tech.tresearchgroup.schemas.galago.enums.QueueTypeEnum;

import java.util.Date;

public class QueueEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private QueueStateEnum status;

    private QueueTypeEnum action;

    private String payload;

    public QueueEntity() {
    }

    public QueueEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
                       @Deserialize("lockType") LockType lockType,
                       @Deserialize("status") QueueStateEnum status,
                       @Deserialize("action") QueueTypeEnum action,
                       @Deserialize("payload") String payload) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.status = status;
        this.action = action;
        this.payload = payload;
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
    public QueueStateEnum getStatus() {
        return status;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public QueueTypeEnum getAction() {
        return action;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getPayload() {
        return payload;
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

    public void setStatus(QueueStateEnum status) {
        this.status = status;
    }

    public void setAction(QueueTypeEnum action) {
        this.action = action;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
