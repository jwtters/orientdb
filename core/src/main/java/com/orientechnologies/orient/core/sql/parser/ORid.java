/* Generated By:JJTree: Do not edit this line. ORid.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.id.ORecordId;

import java.util.Map;

public class ORid extends SimpleNode {
  protected OInteger cluster;
  protected OInteger position;

  public ORid(int id) {
    super(id);
  }

  public ORid(OrientSql p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor.
   **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override public String toString(String prefix) {
    return "#" + cluster.getValue() + ":" + position.getValue();
  }

  public void toString(Map<Object, Object> params, StringBuilder builder) {
    builder.append("#" + cluster.getValue() + ":" + position.getValue());
  }

  public ORecordId toRecordId() {
    return new ORecordId(cluster.value.intValue(), position.value.longValue());
  }

  public ORid copy() {
    ORid result = new ORid(-1);
    result.cluster = cluster;
    result.position = position;
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    ORid oRid = (ORid) o;

    if (cluster != null ? !cluster.equals(oRid.cluster) : oRid.cluster != null)
      return false;
    if (position != null ? !position.equals(oRid.position) : oRid.position != null)
      return false;

    return true;
  }

  @Override public int hashCode() {
    int result = cluster != null ? cluster.hashCode() : 0;
    result = 31 * result + (position != null ? position.hashCode() : 0);
    return result;
  }
}
/* JavaCC - OriginalChecksum=c2c6d67d7722e29212e438574698d7cd (do not edit this line) */
