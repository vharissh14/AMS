USE [AMS]
GO

IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[t_user]') AND type in (N'U'))
DROP TABLE [dbo].[t_user]
GO

USE [AMS]
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[t_user](
	[userid] [varchar](50) NOT NULL,
	[name] [varchar](50) NOT NULL,
	[flat] [varchar](50) NOT NULL,
	[email] [varchar](50) NOT NULL,
	[role] [varchar](50) NOT NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


insert into t_user values('USERGA', 'Wen Chan', 'Flat GA', 'wen.chan@yahoo.com', 'Administrator')
insert into t_user values('USERGB', 'Zhi Lin', 'Flat GB', 'zhi.lin@yahoo.com', 'Secretary')
