package com.postmark.scala

import org.joda.time.DateTime

/** Details of a successful e-mail attempt */
case class PostmarkSuccess (
  To: String,
  Message: String,
  MessageID: String,
  SubmittedAt: DateTime
)