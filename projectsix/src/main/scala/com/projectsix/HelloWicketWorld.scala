package com.projectsix

import org.apache.wicket.protocol.http.WebApplication

class HelloWicketWorld
  extends WebApplication {

  def getHomePage = classOf[HomePage]
}
