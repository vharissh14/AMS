// JavaScript Document
function checkall(checker)
{
	var name=checker.name;
	if(checker.checked)
	{
		var checkedit=true;
	}
	else
	{
		var checkedit=false;
	}
	var collection = document.getElementById("basic-accordian").getElementsByTagName('INPUT');
	for (var x=0; x<collection.length; x++) 
	{
		if (collection[x].type.toUpperCase()=='CHECKBOX' && collection[x].name==name)
		{
			collection[x].checked = checkedit;
		}
	}
}

function insRow()
{
	var tab = document.getElementById('advancesearch');
	var root=tab.getElementsByTagName('tr')[0].parentNode;//the TBODY
	var leng=tab.getElementsByTagName('tr')[0].parentNode.rows.length;
	if(leng%2)
	{
		var clone=tab.getElementsByTagName('tr')[1].cloneNode(true);//the clone of the first row
	}
	else
	{
		var clone=tab.getElementsByTagName('tr')[0].cloneNode(true);//the clone of the first row
	}
	root.appendChild(clone);//appends the clone
}
