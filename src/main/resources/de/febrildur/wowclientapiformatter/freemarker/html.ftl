<html>
<head>
	<title>${title}</title>
	<style type="text/css">
		body {
			border-style: solid;
			border-width: 50px;
			border-color: rgb(18, 18, 18);
			background-color: rgb(18, 18, 18);
			color: rgb(255, 255, 255);
		}
		a {
			color: rgb(62, 166, 255);
		}
		table {
			border-collapse: collapse;
			table-layout: fixed;
			width: 750px;
		}
		table, th, td {
			border: 1px solid rgb(255, 255, 255);
		}
		th, td {
			padding: 5px;
			text-align: left;
		}
		tr:hover{
			background-color: rgb(58, 58, 58);
		}
		tr:nth-child(even) {
			background-color: rgb(38, 38, 38);
		}
		td:nth-child(1) {
			width: 150px;
		}
		td:nth-child(2) {
			width: 200px;
		}
		td:nth-child(3) {
			width: 100px;
		}
		td:nth-child(4) {
			width: 150px;
		}
		td:nth-child(5) {
			width: 150px;
		}
	</style>
</head>
<body>
	<h1>${title}</h1>
	<#list apis as api>
		<a href="#${api.name}">${api.name}</a><br>
	</#list>

	<#list apis as api>
		<h1 id="${api.name}">Name: <#if api.name?has_content>${api.name}</#if></h1>
		<#if api.namespace?has_content><p>Namespace: ${api.namespace}</p></#if>
		
		<#if api.tables?has_content>
			<h2>Tables</h2>
			<#list api.tables as table>
				<h3>${table.type} ${table.name}</h3>
				<#if table.fields?has_content>
					<table border="1">
						<tr>
							<td>Name</td>
							<td>Type</td>
							<td>Nilable</td>
						</tr>
						<#list table.fields as field>
							<tr>
								<td>${field.name}</td>
								<td>${field.type}<#if field.mixin?has_content> (${field.mixin!})</#if></td>
								<td><#if field.nilable?has_content>${field.nilable?string('nilable', '')}</#if></td>
							</tr>
						</#list>
					</table>
				</#if>
			</#list>
		</#if>
			
		<#if api.events?has_content>
			<h2>Events</h2>
			<#list api.events as event>
				<h3>${event.literalName}</h3>
				<#if event.payload?has_content>
					<table border="1">
						<tr>
							<td>Name</td>
							<td>Type</td>
							<td>Nilable</td>
						</tr>
						<#list event.payload as payload>
							<tr>
								<td>${payload.name}</td>
								<td>${payload.type}</td>
								<td><#if payload.nilable?has_content>${payload.nilable?string('nilable', '')}</#if></td>
							</tr>
						</#list>
					</table>
				</#if>
			</#list>
		</#if>
		
		<#if api.functions?has_content>
		<h2>Functions</h2>
			<#list api.functions as function>
				<h3>${function.type} ${function.name}</h3><br>
				<#if function.documentation?has_content>
					Dokumentation:
					<#list function.documentation as documentation>
						${documentation}
					</#list>
				</#if>
				<#if function.arguments?has_content>
					<h4>Arguments</h4>
					<table border="1">
						<tr>
							<td>Name</td>
							<td>Type</td>
							<td>Nilable</td>
							<td>Default</td>
							<td>Documentation</td>
						</tr>
						<#list function.arguments as argument>
							<tr>
								<td>${argument.name}</td>
								<td>${argument.type}</td>
								<td>${argument.nilable?string('nilable', '')}</td>
								<td>${argument._default!}</td>
								<#if argument.documentation?has_content>
									<td>
										<#list argument.documentation as documentation>
											${documentation}
										</#list>
									</td>
								<#else>
									<td>&nbsp;</td>
								</#if>
							</tr>
						</#list>
					</table>
				</#if>
	
				<#if function.returns?has_content>
					<h4>Returns</h4>
					<table border="1">
						<tr>
							<td>Name</td>
							<td>Type</td>
							<td>Nilable</td>
							<td>Documentation</td>
						</tr>
						<#list function.returns as return>
							<tr>
								<td>${return.name}</td>
								<td>${return.type}</td>
								<td>${return.nilable?string('nilable', '')}</td>
								<#if return.documentation?has_content>
									<td>
										<#list return.documentation as documentation>
											${documentation}
										</#list>
									</td>
								<#else>
									<td>&nbsp;</td>
								</#if>
							</tr>
						</#list>
					</table>
				</#if>
				<br><hr>
			</#list>
		</#if>
		<br><hr>
	</#list>
</body>
</html>